(ns ogbe.fulcro.mui.icons.create-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CreateSharp" :default CreateSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-create-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CreateSharp)))