(ns ogbe.fulcro.mui.icons.no-cell-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NoCellRounded" :default NoCellRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-cell-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoCellRounded)))