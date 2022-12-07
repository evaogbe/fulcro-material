(ns ogbe.fulcro.mui.icons.minimize-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/MinimizeTwoTone" :default MinimizeTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-minimize-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MinimizeTwoTone)))