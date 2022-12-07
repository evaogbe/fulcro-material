(ns ogbe.fulcro.mui.icons.wb-shade
  #?(:cljs (:require
            ["@mui/icons-material/WbShade" :default WbShade]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wb-shade
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WbShade)))