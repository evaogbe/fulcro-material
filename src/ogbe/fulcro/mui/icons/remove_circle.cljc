(ns ogbe.fulcro.mui.icons.remove-circle
  #?(:cljs (:require
            ["@mui/icons-material/RemoveCircle" :default RemoveCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-remove-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RemoveCircle)))