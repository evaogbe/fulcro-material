(ns ogbe.fulcro.mui.icons.no-cell-outlined
  #?(:cljs (:require
            ["@mui/icons-material/NoCellOutlined" :default NoCellOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-cell-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoCellOutlined)))