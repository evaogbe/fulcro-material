(ns ogbe.fulcro.mui.icons.laptop-mac
  #?(:cljs (:require
            ["@mui/icons-material/LaptopMac" :default LaptopMac]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-laptop-mac
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LaptopMac)))