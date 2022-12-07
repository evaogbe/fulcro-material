(ns ogbe.fulcro.mui.icons.tap-and-play-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TapAndPlaySharp" :default TapAndPlaySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tap-and-play-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TapAndPlaySharp)))