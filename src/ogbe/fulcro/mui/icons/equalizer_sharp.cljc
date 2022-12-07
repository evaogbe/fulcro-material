(ns ogbe.fulcro.mui.icons.equalizer-sharp
  #?(:cljs (:require
            ["@mui/icons-material/EqualizerSharp" :default EqualizerSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-equalizer-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EqualizerSharp)))