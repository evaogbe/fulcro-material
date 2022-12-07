(ns ogbe.fulcro.mui.icons.three-kplus
  #?(:cljs (:require
            ["@mui/icons-material/ThreeKPlus" :default ThreeKPlus]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-three-kplus
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThreeKPlus)))