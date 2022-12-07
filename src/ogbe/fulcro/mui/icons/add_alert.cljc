(ns ogbe.fulcro.mui.icons.add-alert
  #?(:cljs (:require
            ["@mui/icons-material/AddAlert" :default AddAlert]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-alert
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddAlert)))