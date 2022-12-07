(ns ogbe.fulcro.mui.icons.tungsten-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TungstenSharp" :default TungstenSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tungsten-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TungstenSharp)))