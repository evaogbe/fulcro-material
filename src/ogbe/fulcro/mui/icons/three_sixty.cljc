(ns ogbe.fulcro.mui.icons.three-sixty
  #?(:cljs (:require
            ["@mui/icons-material/ThreeSixty" :default ThreeSixty]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-three-sixty
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThreeSixty)))