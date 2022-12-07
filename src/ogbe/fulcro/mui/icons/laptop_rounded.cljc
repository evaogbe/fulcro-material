(ns ogbe.fulcro.mui.icons.laptop-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LaptopRounded" :default LaptopRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-laptop-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LaptopRounded)))