(ns ogbe.fulcro.mui.icons.laptop-chromebook
  #?(:cljs (:require
            ["@mui/icons-material/LaptopChromebook" :default LaptopChromebook]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-laptop-chromebook
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LaptopChromebook)))