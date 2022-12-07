(ns ogbe.fulcro.mui.icons.play-arrow
  #?(:cljs (:require
            ["@mui/icons-material/PlayArrow" :default PlayArrow]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-play-arrow
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlayArrow)))