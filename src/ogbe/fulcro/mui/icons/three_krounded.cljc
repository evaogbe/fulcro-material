(ns ogbe.fulcro.mui.icons.three-krounded
  #?(:cljs (:require
            ["@mui/icons-material/ThreeKRounded" :default ThreeKRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-three-krounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThreeKRounded)))