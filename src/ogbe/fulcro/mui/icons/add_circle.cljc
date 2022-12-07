(ns ogbe.fulcro.mui.icons.add-circle
  #?(:cljs (:require
            ["@mui/icons-material/AddCircle" :default AddCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddCircle)))