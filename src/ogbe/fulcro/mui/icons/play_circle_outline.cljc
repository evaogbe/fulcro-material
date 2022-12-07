(ns ogbe.fulcro.mui.icons.play-circle-outline
  #?(:cljs (:require
            ["@mui/icons-material/PlayCircleOutline" :default PlayCircleOutline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-play-circle-outline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlayCircleOutline)))