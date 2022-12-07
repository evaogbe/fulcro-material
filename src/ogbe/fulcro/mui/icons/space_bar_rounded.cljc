(ns ogbe.fulcro.mui.icons.space-bar-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SpaceBarRounded" :default SpaceBarRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-space-bar-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpaceBarRounded)))