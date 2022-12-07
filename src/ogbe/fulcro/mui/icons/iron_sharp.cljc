(ns ogbe.fulcro.mui.icons.iron-sharp
  #?(:cljs (:require
            ["@mui/icons-material/IronSharp" :default IronSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-iron-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory IronSharp)))