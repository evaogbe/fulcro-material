(ns ogbe.fulcro.mui.icons.output-rounded
  #?(:cljs (:require
            ["@mui/icons-material/OutputRounded" :default OutputRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-output-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OutputRounded)))