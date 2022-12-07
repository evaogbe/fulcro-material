(ns ogbe.fulcro.mui.icons.gite-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GiteSharp" :default GiteSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gite-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GiteSharp)))