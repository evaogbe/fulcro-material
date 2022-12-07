(ns ogbe.fulcro.mui.icons.three-mp
  #?(:cljs (:require
            ["@mui/icons-material/ThreeMp" :default ThreeMp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-three-mp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThreeMp)))