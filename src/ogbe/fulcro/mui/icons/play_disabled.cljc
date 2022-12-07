(ns ogbe.fulcro.mui.icons.play-disabled
  #?(:cljs (:require
            ["@mui/icons-material/PlayDisabled" :default PlayDisabled]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-play-disabled
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlayDisabled)))