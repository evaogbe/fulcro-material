(ns ogbe.fulcro.mui.icons.refresh-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/RefreshTwoTone" :default RefreshTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-refresh-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RefreshTwoTone)))