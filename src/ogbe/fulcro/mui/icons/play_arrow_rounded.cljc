(ns ogbe.fulcro.mui.icons.play-arrow-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PlayArrowRounded" :default PlayArrowRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-play-arrow-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlayArrowRounded)))