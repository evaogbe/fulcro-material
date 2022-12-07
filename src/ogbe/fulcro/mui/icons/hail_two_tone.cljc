(ns ogbe.fulcro.mui.icons.hail-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/HailTwoTone" :default HailTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hail-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HailTwoTone)))