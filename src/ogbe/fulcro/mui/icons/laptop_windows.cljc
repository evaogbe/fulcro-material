(ns ogbe.fulcro.mui.icons.laptop-windows
  #?(:cljs (:require
            ["@mui/icons-material/LaptopWindows" :default LaptopWindows]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-laptop-windows
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LaptopWindows)))