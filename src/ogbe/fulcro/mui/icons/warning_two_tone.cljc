(ns ogbe.fulcro.mui.icons.warning-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/WarningTwoTone" :default WarningTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-warning-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WarningTwoTone)))