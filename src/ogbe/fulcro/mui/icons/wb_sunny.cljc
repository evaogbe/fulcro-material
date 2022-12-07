(ns ogbe.fulcro.mui.icons.wb-sunny
  #?(:cljs (:require
            ["@mui/icons-material/WbSunny" :default WbSunny]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wb-sunny
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WbSunny)))