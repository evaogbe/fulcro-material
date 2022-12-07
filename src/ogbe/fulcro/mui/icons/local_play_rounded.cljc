(ns ogbe.fulcro.mui.icons.local-play-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LocalPlayRounded" :default LocalPlayRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-play-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalPlayRounded)))