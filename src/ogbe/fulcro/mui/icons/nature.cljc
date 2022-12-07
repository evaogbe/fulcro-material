(ns ogbe.fulcro.mui.icons.nature
  #?(:cljs (:require
            ["@mui/icons-material/Nature" :default Nature]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nature
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Nature)))