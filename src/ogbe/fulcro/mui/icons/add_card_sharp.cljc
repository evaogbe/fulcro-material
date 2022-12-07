(ns ogbe.fulcro.mui.icons.add-card-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AddCardSharp" :default AddCardSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-card-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddCardSharp)))