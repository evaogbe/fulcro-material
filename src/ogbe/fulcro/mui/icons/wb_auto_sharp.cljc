(ns ogbe.fulcro.mui.icons.wb-auto-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WbAutoSharp" :default WbAutoSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wb-auto-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WbAutoSharp)))