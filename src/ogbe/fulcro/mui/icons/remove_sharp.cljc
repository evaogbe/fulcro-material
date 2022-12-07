(ns ogbe.fulcro.mui.icons.remove-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RemoveSharp" :default RemoveSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-remove-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RemoveSharp)))