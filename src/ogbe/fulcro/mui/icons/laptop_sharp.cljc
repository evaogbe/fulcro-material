(ns ogbe.fulcro.mui.icons.laptop-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LaptopSharp" :default LaptopSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-laptop-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LaptopSharp)))