(ns ogbe.fulcro.mui.icons.person-remove
  #?(:cljs (:require
            ["@mui/icons-material/PersonRemove" :default PersonRemove]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-remove
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonRemove)))