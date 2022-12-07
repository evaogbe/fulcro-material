(ns ogbe.fulcro.mui.icons.landscape-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LandscapeRounded" :default LandscapeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-landscape-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LandscapeRounded)))