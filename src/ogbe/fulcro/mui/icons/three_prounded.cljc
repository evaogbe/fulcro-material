(ns ogbe.fulcro.mui.icons.three-prounded
  #?(:cljs (:require
            ["@mui/icons-material/ThreePRounded" :default ThreePRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-three-prounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThreePRounded)))