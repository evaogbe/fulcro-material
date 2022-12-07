(ns ogbe.fulcro.mui.icons.play-disabled-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PlayDisabledRounded" :default PlayDisabledRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-play-disabled-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlayDisabledRounded)))