(ns ogbe.fulcro.mui.icons.egg-sharp
  #?(:cljs (:require
            ["@mui/icons-material/EggSharp" :default EggSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-egg-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EggSharp)))