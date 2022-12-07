(ns ogbe.fulcro.mui.icons.add-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AddSharp" :default AddSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddSharp)))