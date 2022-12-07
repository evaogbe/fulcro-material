(ns ogbe.fulcro.mui.icons.tap-and-play-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TapAndPlayRounded" :default TapAndPlayRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tap-and-play-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TapAndPlayRounded)))