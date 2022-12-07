(ns ogbe.fulcro.mui.icons.cancel
  #?(:cljs (:require
            ["@mui/icons-material/Cancel" :default Cancel]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cancel
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Cancel)))