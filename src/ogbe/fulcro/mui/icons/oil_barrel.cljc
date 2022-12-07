(ns ogbe.fulcro.mui.icons.oil-barrel
  #?(:cljs (:require
            ["@mui/icons-material/OilBarrel" :default OilBarrel]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-oil-barrel
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OilBarrel)))