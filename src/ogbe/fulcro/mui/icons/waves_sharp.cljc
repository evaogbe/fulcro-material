(ns ogbe.fulcro.mui.icons.waves-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WavesSharp" :default WavesSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-waves-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WavesSharp)))