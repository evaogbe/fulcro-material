(ns ogbe.fulcro.mui.icons.play-for-work
  #?(:cljs (:require
            ["@mui/icons-material/PlayForWork" :default PlayForWork]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-play-for-work
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlayForWork)))