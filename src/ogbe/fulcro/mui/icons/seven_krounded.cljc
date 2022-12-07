(ns ogbe.fulcro.mui.icons.seven-krounded
  #?(:cljs (:require
            ["@mui/icons-material/SevenKRounded" :default SevenKRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-seven-krounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SevenKRounded)))