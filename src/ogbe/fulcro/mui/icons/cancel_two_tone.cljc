(ns ogbe.fulcro.mui.icons.cancel-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/CancelTwoTone" :default CancelTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cancel-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CancelTwoTone)))