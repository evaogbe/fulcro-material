(ns ogbe.fulcro.mui.icons.fit-screen-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FitScreenRounded" :default FitScreenRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fit-screen-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FitScreenRounded)))