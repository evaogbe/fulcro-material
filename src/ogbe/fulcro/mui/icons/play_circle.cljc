(ns ogbe.fulcro.mui.icons.play-circle
  #?(:cljs (:require
            ["@mui/icons-material/PlayCircle" :default PlayCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-play-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlayCircle)))