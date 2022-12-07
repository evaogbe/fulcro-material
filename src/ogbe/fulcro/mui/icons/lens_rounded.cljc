(ns ogbe.fulcro.mui.icons.lens-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LensRounded" :default LensRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lens-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LensRounded)))