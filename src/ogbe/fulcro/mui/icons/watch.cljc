(ns ogbe.fulcro.mui.icons.watch
  #?(:cljs (:require
            ["@mui/icons-material/Watch" :default Watch]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-watch
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Watch)))