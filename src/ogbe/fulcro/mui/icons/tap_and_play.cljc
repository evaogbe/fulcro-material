(ns ogbe.fulcro.mui.icons.tap-and-play
  #?(:cljs (:require
            ["@mui/icons-material/TapAndPlay" :default TapAndPlay]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tap-and-play
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TapAndPlay)))